package miaoshaproject.dao;

import miaoshaproject.dataobject.UserPasswordDAO;

public interface UserPasswordDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    int insert(UserPasswordDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    int insertSelective(UserPasswordDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    UserPasswordDAO selectByPrimaryKey(Integer id);

    UserPasswordDAO selectByUserId(Integer userId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    int updateByPrimaryKeySelective(UserPasswordDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbggenerated Thu Mar 14 00:10:11 CST 2019
     */
    int updateByPrimaryKey(UserPasswordDAO record);
}