package org.glamourArts.Services.Buyer;

import org.glamourArts.Data.Model.Art;
import org.glamourArts.Dtos.Request.BuyerRequest.BuyerLoginRequest;
import org.glamourArts.Dtos.Request.BuyerRequest.BuyerRegisterRequest;

import java.math.BigDecimal;
import java.util.List;

public interface BuyerService {
    void register ( BuyerRegisterRequest buyerRegisterRequest) ;
    String login (BuyerLoginRequest buyerLoginRequest) ;
    List<Art> viewAllArt (String buyerEmail) ;
    void purchaseArt (String buyerEmail, Long artId, BigDecimal amount);
}
