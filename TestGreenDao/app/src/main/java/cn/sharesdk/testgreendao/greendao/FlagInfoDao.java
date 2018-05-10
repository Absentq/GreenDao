package cn.sharesdk.testgreendao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.sharesdk.testgreendao.sqlite.FlagInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FLAG_INFO".
*/
public class FlagInfoDao extends AbstractDao<FlagInfo, Long> {

    public static final String TABLENAME = "FLAG_INFO";

    /**
     * Properties of entity FlagInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, long.class, "_id", true, "_id");
        public final static Property Uid = new Property(1, String.class, "uid", false, "UID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Number = new Property(3, String.class, "number", false, "NUMBER");
    }


    public FlagInfoDao(DaoConfig config) {
        super(config);
    }
    
    public FlagInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FLAG_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: _id
                "\"UID\" TEXT," + // 1: uid
                "\"NAME\" TEXT," + // 2: name
                "\"NUMBER\" TEXT);"); // 3: number
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FLAG_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FlagInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.get_id());
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(4, number);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FlagInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.get_id());
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String number = entity.getNumber();
        if (number != null) {
            stmt.bindString(4, number);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public FlagInfo readEntity(Cursor cursor, int offset) {
        FlagInfo entity = new FlagInfo( //
            cursor.getLong(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // number
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FlagInfo entity, int offset) {
        entity.set_id(cursor.getLong(offset + 0));
        entity.setUid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FlagInfo entity, long rowId) {
        entity.set_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FlagInfo entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FlagInfo entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}