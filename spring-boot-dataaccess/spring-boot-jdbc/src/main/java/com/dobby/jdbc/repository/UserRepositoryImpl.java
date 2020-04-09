package com.dobby.jdbc.repository;

import com.dobby.jdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author liguoqing
 */
@Repository
public class UserRepositoryImpl implements UserRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int save(User user) {
        String sql = "INSERT INTO t_users(name, password, age) values(?, ?, ?)";
        return jdbcTemplate.update(sql, user.getName(), user.getPassword(), user.getAge());
    }

    @Override
    public int update(User user) {
        String sql = "UPDATE t_users SET name = ? , password = ? , age = ? WHERE id=?";
        return jdbcTemplate.update(sql, user.getName(), user.getPassword(), user.getAge(), user.getId());
    }

    @Override
    public int delete(long id) {
        String sql = "DELETE FROM t_users where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<User> findALL() {
        String sql = "SELECT * FROM t_users";
        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    @Override
    public User findById(long id) {
        String sql = "SELECT * FROM t_users WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<User>(User.class));
    }


    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            return user;
        }

    }
}
