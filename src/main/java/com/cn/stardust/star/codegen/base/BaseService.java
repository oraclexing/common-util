package com.cn.stardust.star.codegen.base;

import java.util.List;

/**
 * https://github.com/oraclexing
 * <p>
 *  Service 的基类，被其他Service 实现
 *
 * @author stardust
 * @version 1.0.0
 */
public interface BaseService<T> {

    Long add(T t) throws Exception;

    Boolean modify(T t) throws Exception;

    Boolean remove(Long id) throws Exception;

    List<T> search(T t) throws Exception;

    T get(Long id) throws Exception;

}