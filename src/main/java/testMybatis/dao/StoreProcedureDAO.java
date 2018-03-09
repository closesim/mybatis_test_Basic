package testMybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import testMybatis.data.SPMapper;
import testMybatis.model.Param;
import testMybatis.model.Param2;
import testMybatis.model.State;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * StoreProcedure DAO - xml and annotation config
 *
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class StoreProcedureDAO {

    public int callTotalCity() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Param param = new Param();
            spMapper.callGetTotalCity(param);
            return param.getTotal();
        } finally {
            session.close();
        }
    }

    public int callTotalCity2() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spmapper = session.getMapper(SPMapper.class);

        try {

            Map<String, Object> param = new HashMap<String, Object>();
            param.put("total", 0);
            spmapper.callGetTotalCity2(param);
            return (Integer) param.get("total");
        } finally {
            session.close();
        }
    }

    public int callGetTotalCityStateId() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Param2 param2 = new Param2();
            param2.setStateId(1);
            spMapper.callGetTotalCityStateId(param2);
            return param2.getShit();
        } finally {
            session.close();
        }
    }

    public List<State> callGetStates() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            return spMapper.callGetStates();
        } finally {
            session.close();
        }
    }

    public int callGetTotalCityAnnotations() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Param param = new Param();
            spMapper.callGetTotalCityAnnotations(param);
            return param.getTotal();
        } finally {
            session.close();
        }
    }

    public int callGetTotalCityStateIdAnnotations() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            Param2 param2 = new Param2();
            param2.setStateId(1);
            spMapper.callGetTotalCityStateIdAnnotations(param2);
            return param2.getShit();
        } finally {
            session.close();
        }
    }

    public List<State> callGetStatesAnnotations() {

        SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        SPMapper spMapper = session.getMapper(SPMapper.class);

        try {
            return spMapper.callGetStatesAnnotations();
        } finally {
            session.close();
        }
    }
}
