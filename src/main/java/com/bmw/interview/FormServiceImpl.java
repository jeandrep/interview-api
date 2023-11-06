package com.bmw.interview;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FormServiceImpl implements FormService {

        @Override
        public Form returnData(Form form) {
            return form;
        }
}