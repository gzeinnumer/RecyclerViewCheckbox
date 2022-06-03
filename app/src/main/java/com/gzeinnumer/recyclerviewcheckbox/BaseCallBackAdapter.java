package com.gzeinnumer.recyclerviewcheckbox;

public interface BaseCallBackAdapter<T> {
    void onClick(int type, int position, T data);
}