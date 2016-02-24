package pw.jason19659.richi.dao;

import pw.jason19659.richi.model.Rank;

public interface RankMapper extends BaseMapper<Rank>{
    int deleteByPrimaryKey(Integer id);

    int insert(Rank record);

    int insertSelective(Rank record);

    Rank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rank record);

    int updateByPrimaryKey(Rank record);
}