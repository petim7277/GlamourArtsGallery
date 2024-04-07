package org.glamourArts.services.Admin;

import org.glamourArts.Data.Repositories.AdminRepository;
import org.glamourArts.Dtos.Request.AdminRequest.AdminLoginRequest;
import org.glamourArts.Dtos.Request.AdminRequest.AdminRegisterRequest;
import org.glamourArts.Dtos.Request.ArtRequest.ArtRequest;
import org.glamourArts.Dtos.Request.ArtistRequest.ArtistUploadArtRequest;
import org.glamourArts.Dtos.Response.AdminLoginResponse;
import org.glamourArts.Dtos.Response.AdminResponse;
import org.glamourArts.Dtos.Response.ArtResponse;
import org.glamourArts.Exceptions.AdminExceptions.AdminDoesNotExistException;
import org.glamourArts.Exceptions.AdminExceptions.EmptyFieldsException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static java.math.BigDecimal.TEN;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AdminServiceTest {
    @Autowired
    private AdminService adminService;
    @Autowired

    
    private AdminRepository adminRepository;
  
    private AdminResponse adminResponse;

    private AdminLoginResponse adminLoginResponse;

    private ArtResponse artResponse;



    @Test
    void testAdminCanRegister_WithEmptyNameField() {
        AdminRegisterRequest registerRequest = new AdminRegisterRequest();
        registerRequest.setAdminName(" ");
        registerRequest.setAdminPassword("pre1234 ");
        registerRequest.setAdminEmail("petim7277@gmail.com");
        assertThrows(EmptyFieldsException.class,()->adminService.register(registerRequest));

    }

    @Test
    void testAdminCanRegister_WithEmptyPasswordField() {
        AdminRegisterRequest registerRequest = new AdminRegisterRequest();
        registerRequest.setAdminName("joyce ");
        registerRequest.setAdminPassword(" ");
        registerRequest.setAdminEmail("petim7277@gmail.com");
        assertThrows(EmptyFieldsException.class,()->adminService.register(registerRequest));

    }

    @Test
    void testAdminCanRegister_WithEmptyEmailField() {
        AdminRegisterRequest registerRequest = new AdminRegisterRequest();
        registerRequest.setAdminName("joyce ");
        registerRequest.setAdminPassword("pre1234");
        registerRequest.setAdminEmail("");
        assertThrows(EmptyFieldsException.class,()->adminService.register(registerRequest));

    }



    @Test
    void testThatAdmin_CanRegister() {
        AdminRegisterRequest registerRequest = new AdminRegisterRequest();
        registerRequest.setAdminName("Arya Stark");
        registerRequest.setAdminPassword("arya123");
        registerRequest.setAdminEmail("arya7277@gmail.com");
        adminService.register(registerRequest);
        assertEquals(3,adminRepository.count());

    }

    @Test
    void adminLoginTest(){
        AdminLoginRequest adminLoginRequest = new AdminLoginRequest();
        adminLoginRequest.setAdminName("Etim Precious");
        adminLoginRequest.setAdminPassword("prec,1234");
        adminService.login(adminLoginRequest);
        assertNotNull(adminLoginResponse.getMessage());
    }

    @Test
    void testThatUnregistered_AdminCanLogin(){
        AdminLoginRequest adminLoginRequest = new AdminLoginRequest();
        adminLoginRequest.setAdminName("Joseph joy");
        adminLoginRequest.setAdminPassword("password");
        assertThrows(AdminDoesNotExistException.class,()-> adminService.login(adminLoginRequest));

    }

    @Test
    void adminUploadArtTest(){
        ArtRequest artRequest = new ArtRequest();
        ArtistUploadArtRequest artistUploadRequest = new ArtistUploadArtRequest();
        artistUploadRequest.setArtistName("Denarius targerian");
        artistUploadRequest.setArtistPassword("password");
        artRequest.setArtName("Fine_Arts");
        artRequest.setArtDescription("An african art displaying mother africa");
        artRequest.setArtPrice(TEN);
        adminService.uploadArt(artRequest,artistUploadRequest);
        assertNotNull(artResponse.getMessage());
    }


}