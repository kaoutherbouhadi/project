package com.example.projetintegr.service;

import com.example.projetintegr.entities.Certif;
import com.example.projetintegr.entities.UsersCLub;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UsersCLubService {
    UsersCLub saveUsersCLub(UsersCLub userc);
    UsersCLub updateUsersCLub(UsersCLub userc);
    void deleteUsersCLub(UsersCLub cer);
    void deleteUsersCLubById(Long id);
    UsersCLub getUsersCLub(Long id);
    List<UsersCLub> getAllUsersCLub();
    Page<UsersCLub> getAllUsersCLubsParPage(int page, int size);

    UsersCLub getUsersCLubById(Long id);

}
