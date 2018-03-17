package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.Record;

import java.util.List;

public interface RecordDao {

    List<Record> getAll();

    void save(Record record);

    void update(Record record);

    void detele(Record record);
}
