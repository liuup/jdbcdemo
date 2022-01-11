/*
*
* */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/*
* 查询：查询所有数据
* 添加：添加品牌
* 修改：根据id修改
* 删除：根据id删除
* */

public class BrandTest {
    public static void main(String[] argv) throws Exception {
        Database database = new Database();

//        database.addData("Tesla", "Tesla",
//                100, "Electric Cars, Solar & Clean Energy", 1);
//        database.deleteData(5);
        database.alterBrandName(3, "Xiaomi");
        database.queryData();
    }
}
