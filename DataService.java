package com.Heaper.service;

import com.Heaper.mapper.IDataMapper;
import com.Heaper.utils.Session;
import org.apache.ibatis.session.SqlSession;
import com.Heaper.JavaBeans.Data;
import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @author:mzxy
 * @date: 2025/6/12 22:01
 */
public class DataService {
    SqlSession session = Session.getSession();
    IDataMapper mapper = session.getMapper(IDataMapper.class);
    public List<Data> select_all(){
        return mapper.select_all();
    }
}
