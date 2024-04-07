package org.glamourArts.services.Admin;
import org.glamourArts.Dtos.Request.AdminRequest.AdminLoginRequest;
import org.glamourArts.Dtos.Request.AdminRequest.AdminRegisterRequest;
import org.glamourArts.Dtos.Request.ArtRequest.ArtRequest;

public interface AdminServiceZ {
    String register (AdminRegisterRequest adminRegisterRequest);
    String login(AdminLoginRequest adminLoginRequest);
    void uploadArt(ArtRequest artRequest);
    
}
