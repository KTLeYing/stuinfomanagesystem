package com.dao;

import com.entity.Exam;

import java.util.List;
import java.util.Map;


/**
 * 操作成绩的数据层接口
 * @author bojiangzhou
 *
 */
public interface ScoreDaoInter extends BaseDaoInter {
	
	/**
	 * 获取学生成绩表
	 * @param exam
	 * @param param
	 * @return
	 */
	List<Map<String, Object>> getScoreList(Exam exam);
	
}
