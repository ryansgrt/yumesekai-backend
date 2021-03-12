package com.snflwrsdev.yumesekai.services;

import com.snflwrsdev.yumesekai.model.MRoom;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RoomServices {
    public MRoom saveSong(MRoom song);
    public MRoom getSong(String id);
    public Page<MRoom> getAllSongs(Pageable pageable);
    public void deleteSong(String id);
}
