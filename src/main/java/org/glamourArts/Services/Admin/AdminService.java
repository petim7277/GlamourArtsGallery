package org.glamourArts.Services.Admin;
import org.glamourArts.Dtos.Request.AdminRequest.AdminLoginRequest;
import org.glamourArts.Dtos.Request.AdminRequest.AdminRegisterRequest;
import org.glamourArts.Dtos.Request.ArtRequest.ArtRequest;

public interface AdminService {
    void register (AdminRegisterRequest adminRegisterRequest);
    String login(AdminLoginRequest adminLoginRequest);
    void uploadArt(ArtRequest artRequest);
    
}
