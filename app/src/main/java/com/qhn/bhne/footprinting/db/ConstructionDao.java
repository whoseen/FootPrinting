package com.qhn.bhne.footprinting.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.qhn.bhne.footprinting.mvp.entries.Construction;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CONSTRUCTION".
*/
public class ConstructionDao extends AbstractDao<Construction, Long> {

    public static final String TABLENAME = "CONSTRUCTION";

    /**
     * Properties of entity Construction.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ConstructionId = new Property(0, Long.class, "constructionId", true, "_id");
        public final static Property ParentID = new Property(1, Long.class, "parentID", false, "PARENT_ID");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Category = new Property(3, String.class, "category", false, "CATEGORY");
        public final static Property UserName = new Property(4, String.class, "userName", false, "USER_NAME");
        public final static Property Profession = new Property(5, String.class, "profession", false, "PROFESSION");
        public final static Property VoltageClass = new Property(6, String.class, "voltageClass", false, "VOLTAGE_CLASS");
        public final static Property Remark = new Property(7, String.class, "remark", false, "REMARK");
        public final static Property Date = new Property(8, String.class, "date", false, "DATE");
    }


    public ConstructionDao(DaoConfig config) {
        super(config);
    }
    
    public ConstructionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CONSTRUCTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: constructionId
                "\"PARENT_ID\" INTEGER NOT NULL ," + // 1: parentID
                "\"NAME\" TEXT NOT NULL ," + // 2: name
                "\"CATEGORY\" TEXT NOT NULL ," + // 3: category
                "\"USER_NAME\" TEXT NOT NULL ," + // 4: userName
                "\"PROFESSION\" TEXT," + // 5: profession
                "\"VOLTAGE_CLASS\" TEXT," + // 6: voltageClass
                "\"REMARK\" TEXT," + // 7: remark
                "\"DATE\" TEXT);"); // 8: date
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_CONSTRUCTION_NAME ON CONSTRUCTION" +
                " (\"NAME\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CONSTRUCTION\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Construction entity) {
        stmt.clearBindings();
 
        Long constructionId = entity.getConstructionId();
        if (constructionId != null) {
            stmt.bindLong(1, constructionId);
        }
        stmt.bindLong(2, entity.getParentID());
        stmt.bindString(3, entity.getName());
        stmt.bindString(4, entity.getCategory());
        stmt.bindString(5, entity.getUserName());
 
        String profession = entity.getProfession();
        if (profession != null) {
            stmt.bindString(6, profession);
        }
 
        String voltageClass = entity.getVoltageClass();
        if (voltageClass != null) {
            stmt.bindString(7, voltageClass);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(9, date);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Construction entity) {
        stmt.clearBindings();
 
        Long constructionId = entity.getConstructionId();
        if (constructionId != null) {
            stmt.bindLong(1, constructionId);
        }
        stmt.bindLong(2, entity.getParentID());
        stmt.bindString(3, entity.getName());
        stmt.bindString(4, entity.getCategory());
        stmt.bindString(5, entity.getUserName());
 
        String profession = entity.getProfession();
        if (profession != null) {
            stmt.bindString(6, profession);
        }
 
        String voltageClass = entity.getVoltageClass();
        if (voltageClass != null) {
            stmt.bindString(7, voltageClass);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(8, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(9, date);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Construction readEntity(Cursor cursor, int offset) {
        Construction entity = new Construction( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // constructionId
            cursor.getLong(offset + 1), // parentID
            cursor.getString(offset + 2), // name
            cursor.getString(offset + 3), // category
            cursor.getString(offset + 4), // userName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // profession
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // voltageClass
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // remark
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // date
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Construction entity, int offset) {
        entity.setConstructionId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setParentID(cursor.getLong(offset + 1));
        entity.setName(cursor.getString(offset + 2));
        entity.setCategory(cursor.getString(offset + 3));
        entity.setUserName(cursor.getString(offset + 4));
        entity.setProfession(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setVoltageClass(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRemark(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDate(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Construction entity, long rowId) {
        entity.setConstructionId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Construction entity) {
        if(entity != null) {
            return entity.getConstructionId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Construction entity) {
        return entity.getConstructionId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
