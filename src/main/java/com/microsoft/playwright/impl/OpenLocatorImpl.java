package com.microsoft.playwright.impl;

import com.microsoft.playwright.Locator;

public class OpenLocatorImpl extends LocatorImpl{
    public OpenLocatorImpl(Locator locator) {
        super(((LocatorImpl) locator).frame, ((LocatorImpl) locator).selector, null);
    }

}
