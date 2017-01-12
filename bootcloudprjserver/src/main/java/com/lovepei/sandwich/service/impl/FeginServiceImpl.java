package com.lovepei.sandwich.service.impl;

import com.lovepei.sandwich.service.FeginServiceTest;

/**
 * Created by cumt_cx on 2017/1/12.
 */
public class FeginServiceImpl implements FeginServiceTest {
    @Override public String getFeignCallString() {
        return "I am Call Remote Method By Feign";
    }
}
