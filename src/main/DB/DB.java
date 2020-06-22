package DB;

import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql:postgres://fxsckkdlnldszg:1fec21249a783ec7d24fd4ace3fc3a650e7fdac7ab58477c84cc5c27bd3a4ad3@ec2-18-214-211-47.compute-1.amazonaws.com:5432/d42fmh53a57h34);
}