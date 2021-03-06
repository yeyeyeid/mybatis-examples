package transaction;

import org.apache.ibatis.annotations.Param;
import pojo.Account;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
	/**
	 * get accounts according to status
	 *
	 * @param status active or inactive
	 * @return list of accounts
	 */
	default List<Account> getAccounts(@Param("status") String status) {
		return this.getAccounts(status, -1);
	}

	/**
	 * get accounts according to status and owner
	 *
	 * @param status active or inactive
	 * @param owner  owner id
	 * @return list of accounts
	 */
	List<Account> getAccounts(@Param("status") String status, @Param("owner") int owner);


	/**
	 * save account
	 * 
	 * @param account an account object
	 */
	void saveAccount(@Param("account") Account account);
}
