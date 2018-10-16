package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.Record;

import java.util.List;

public interface RecordDao {

    List<Record> getAll();

    void save(Record record);

    void update(Record record);

    void delete(String id);
}
