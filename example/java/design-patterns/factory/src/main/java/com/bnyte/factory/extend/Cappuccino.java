package com.bnyte.factory.extend;

import com.bnyte.factory.Coffee;

/**
 * @author bnyte
 * @since 2022/5/23 12:37
 */
public class Cappuccino implements Coffee {
    @Override
    public String getName() {
        return "卡布奇诺";
    }
}
