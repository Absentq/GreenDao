package cn.sharesdk.testgreendao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import cn.sharesdk.testgreendao.sqlite.DeviceInfo.Area;
import cn.sharesdk.testgreendao.sqlite.DeviceInfo.Flag;
import java.util.List;

import cn.sharesdk.testgreendao.sqlite.DeviceInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DEVICE_INFO".
*/
public class DeviceInfoDao extends AbstractDao<DeviceInfo, Void> {

    public static final String TABLENAME = "DEVICE_INFO";

    /**
     * Properties of entity DeviceInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Flags = new Property(0, String.class, "flags", false, "FLAGS");
        public final static Property Area = new Property(1, String.class, "area", false, "AREA");
    }

    private final Flag flagsConverter = new Flag();
    private final Area areaConverter = new Area();

    public DeviceInfoDao(DaoConfig config) {
        super(config);
    }
    
    public DeviceInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DEVICE_INFO\" (" + //
                "\"FLAGS\" TEXT," + // 0: flags
                "\"AREA\" TEXT);"); // 1: area
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DEVICE_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DeviceInfo entity) {
        stmt.clearBindings();
 
        List flags = entity.getFlags();
        if (flags != null) {
            stmt.bindString(1, flagsConverter.convertToDatabaseValue(flags));
        }
 
        List area = entity.getArea();
        if (area != null) {
            stmt.bindString(2, areaConverter.convertToDatabaseValue(area));
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DeviceInfo entity) {
        stmt.clearBindings();
 
        List flags = entity.getFlags();
        if (flags != null) {
            stmt.bindString(1, flagsConverter.convertToDatabaseValue(flags));
        }
 
        List area = entity.getArea();
        if (area != null) {
            stmt.bindString(2, areaConverter.convertToDatabaseValue(area));
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DeviceInfo readEntity(Cursor cursor, int offset) {
        DeviceInfo entity = new DeviceInfo( //
            cursor.isNull(offset + 0) ? null : flagsConverter.convertToEntityProperty(cursor.getString(offset + 0)), // flags
            cursor.isNull(offset + 1) ? null : areaConverter.convertToEntityProperty(cursor.getString(offset + 1)) // area
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DeviceInfo entity, int offset) {
        entity.setFlags(cursor.isNull(offset + 0) ? null : flagsConverter.convertToEntityProperty(cursor.getString(offset + 0)));
        entity.setArea(cursor.isNull(offset + 1) ? null : areaConverter.convertToEntityProperty(cursor.getString(offset + 1)));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DeviceInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DeviceInfo entity) {
        return null;
    }

    @Override
    public boolean hasKey(DeviceInfo entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
