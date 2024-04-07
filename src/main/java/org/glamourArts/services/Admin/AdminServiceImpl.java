package org.glamourArts.services.Admin;
import lombok.RequiredArgsConstructor;
import org.glamourArts.Data.Model.Admin;
import org.glamourArts.Data.Repositories.AdminRepository;
import org.glamourArts.Dtos.Request.AdminRequest.AdminLoginRequest;
import org.glamourArts.Dtos.Request.AdminRequest.AdminRegisterRequest;
import org.glamourArts.Dtos.Request.ArtRequest.ArtRequest;
import org.glamourArts.Dtos.Response.AdminResponse;
import org.glamourArts.Exceptions.AdminExceptions.*;
import org.springframework.stereotype.Service;

import static org.glamourArts.Utill.Mapper.registerMapper;
import static org.glamourArts.Utill.Validator.*;

@Service
@RequiredArgsConstructor
//@AllArgsConstructor
public class AdminServiceZImpl implements AdminServiceZ {

    private final AdminRepository adminRepository;
    @Override
    public String register(AdminRegisterRequest adminRegisterRequest) {
        checkEmptyFields(adminRegisterRequest);
        validateFields(adminRegisterRequest);                                                                    
       if (checkIfAdminExist(adminRegisterRequest.getAdminName()))
           throw  new AdminExistException("Admin already exist"+ adminRegisterRequest.getAdminName()) ;
       Admin admin = registerMapper(adminRegisterRequest);
        AdminResponse adminResponse = new AdminResponse();
        adminResponse.setIsEnabled(true);
       adminRepository.save(admin);
        adminResponse.setMessage("Admin has been registered successfully");
        return adminResponse.getMessage();
    }

    @Override
    public String login(AdminLoginRequest adminLoginRequest) {
        return null;
    }

    @Override
    public void uploadArt(ArtRequest artRequest) {

    }
     public void checkEmptyFields (AdminRegisterRequest adminRegisterRequest){
       if (adminRegisterRequest.getAdminName().trim().isEmpty() ) {
           throw new EmptyFieldsException("Admin name field is empty");
       }
         if (adminRegisterRequest.getAdminPassword().trim().isEmpty() ) {
             throw new EmptyFieldsException("Admin password field is empty");
         }
         if (adminRegisterRequest.getAdminEmail().trim().isEmpty() ) {
             throw new EmptyFieldsException("Admin email field is empty");
         }

     }
     public void validateFields(AdminRegisterRequest adminRegisterRequest){
         if(validateName(adminRegisterRequest.getAdminName())){
             throw new InvalidAdminNameException("Invalid Admin Name");
         }
         if(validatePassword(adminRegisterRequest.getAdminName())){
             throw new InvalidAdminPasswordException("Invalid Admin Password");
         }
         if(validateEmail(adminRegisterRequest.getAdminName())){
             throw new InvalidAdminEmailException("Invalid Admin Email");
         }


     }
    public boolean checkIfAdminExist(String adminName) {
        Admin admin = new Admin();
    return admin != null;
    }
}
