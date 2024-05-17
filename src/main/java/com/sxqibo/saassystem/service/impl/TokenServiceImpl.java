package com.sxqibo.saassystem.service.impl;

import com.sxqibo.saassystem.entity.Token;
import com.sxqibo.saassystem.mapper.TokenMapper;
import com.sxqibo.saassystem.service.ITokenService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户Token表 服务实现类
 * </p>
 *
 * @author JiYun
 * @since 2024-05-15
 */
@Service
public class TokenServiceImpl extends ServiceImpl<TokenMapper, Token> implements ITokenService {

}
