package com.wj.sso.common.tool.validator;

import com.wj.sso.common.tool.exception.ValidateException;
import com.wj.sso.common.tool.util.StringUtils;
import com.wj.sso.common.tool.util.ValidateUtils;

public enum Validator {
    NOT_BLANK {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (StringUtils.isBlank(value)) {
                throw new ValidateException(name + "不能为空！");
            }
        }
    },
    CHINESE {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isChinese(value)) {
                throw new ValidateException(name + "必须为中文");
            }
        }
    },
    INT {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isInteger(value)) {
                throw new ValidateException(name + "必须为整数");
            }
        }
    },
    DATE {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isDate(value)) {
                throw new ValidateException(name + "格式不对！");
            }
        }
    },
    IDNO {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isIdNo(value)) {
                throw new ValidateException(name + "不符合身份证格式");
            }
        }
    },
    IP {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isIp(value)) {
                throw new ValidateException(name + "不符合IP地址格式");
            }
        }
    },
    EMAIL {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isEmail(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    },
    MOBILE {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isMobile(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    },
    PASSWORD {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isPassword(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    },
    PERSONNAME {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isPersonName(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    },
    USERNAME {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isUsername(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    },
    MONEY {
        @Override
        public void validate(String name, String value) throws ValidateException {
            if (!ValidateUtils.isMoney(value)) {
                throw new ValidateException(name + "格式不正确，请检查！");
            }
        }
    };

    /**
     * 参数校验
     *
     * @param name  参数的中文名称
     * @param value 参数的值
     * @throws Exception
     */
    public abstract void validate(String name, String value) throws ValidateException;

    /**
     * 根据验证器的名称获取验证器
     *
     * @param validatorName
     * @return
     */
    public static Validator getValidator(Validator v) {
        for (Validator validator : values()) {
            if (validator == v) {
                return validator;
            }
        }
        return null;
    }

}
