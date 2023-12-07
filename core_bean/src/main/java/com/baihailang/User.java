package com.baihailang;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Admin
 *
 */
@Data
@AllArgsConstructor
public class User {
	private String  idcard_name;
	private String  idcard_no;
	private String  user_name;
	private String  user_id;
	private String  user_password;
}
