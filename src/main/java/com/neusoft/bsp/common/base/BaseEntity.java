package com.neusoft.bsp.common.base;

import java.io.Serializable;

//seriablizable 用于cache
public interface BaseEntity<E extends Serializable> extends Serializable {
    E getId();
}
