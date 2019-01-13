package com.gmail.snitchuk99.util.dao;

public enum StatementType {

    Add("add"),
    GetById("getById"),
    GetByName("getByName"),
    GetAll("getAll"),
//    UpdateById("updateById"),
    DeleteById("deleteById"),
    DeleteByName("deleteByName");

    private String propKey;

    StatementType(String propKey){
        this.propKey = propKey;
    }

    @Override
    public String toString() {
        return propKey;
    }
}
