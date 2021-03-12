package com.snflwrsdev.yumesekai.services.impl;

import com.snflwrsdev.yumesekai.model.MRoom;
import com.snflwrsdev.yumesekai.services.RoomServices;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class RoomServicesDBImpl implements RoomServices {
    @Override
    public MRoom saveSong(MRoom song) {
        return null;
    }

    @Override
    public MRoom getSong(String id) {
        return null;
    }

    @Override
    public Page<MRoom> getAllSongs(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteSong(String id) {

    }
}
