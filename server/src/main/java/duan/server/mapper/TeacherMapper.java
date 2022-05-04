package duan.server.mapper;

import duan.server.entity.Teacher;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author duanyhui
 * @since 2022-05-05
 */
@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {

    public Teacher findByTid(@Param("tid") Integer tid);
}
