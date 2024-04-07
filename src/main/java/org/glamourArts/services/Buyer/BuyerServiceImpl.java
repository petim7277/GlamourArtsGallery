package org.glamourArts.Services.Buyer;

import org.glamourArts.Data.Model.Art;
import org.glamourArts.Dtos.Request.BuyerRequest.BuyerLoginRequest;
import org.glamourArts.Dtos.Request.BuyerRequest.BuyerRegisterRequest;

import java.math.BigDecimal;
import java.util.List;

public class BuyerServiceImpl implements BuyerService{
    @Override
    public void register(BuyerRegisterRequest buyerRegisterRequest) {
        
    }

    @Override
    public String login(BuyerLoginRequest buyerLoginRequest) {
        return null;
    }

    @Override
    public List<Art> viewAllArt(String buyerEmail) {
        return null;
    }

    @Override
    public void purchaseArt(String buyerEmail, Long artId, BigDecimal amount) {

    }
}
