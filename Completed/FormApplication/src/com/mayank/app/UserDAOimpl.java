package com.mayank.app;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDAOimpl implements UserDAO{


	DataSource dataSource;
	
	public DataSource getDataSource()
	{
			return this.dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;
	}
	@Override
	public void insert(User user) {
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource);
		String sql = "INSERT INTO TO_TCACHQE (isn,srt_cde,payee_name,acc_num,chq_ser)"
				+ " VALUES (?, ?, ?, ?,?)";
		jdbcTemplate.update(sql, user.getisn(), user.getsrt_cde(),user.getpayee_name(),user.getacc_num(), user.getchq_ser());
	}
}