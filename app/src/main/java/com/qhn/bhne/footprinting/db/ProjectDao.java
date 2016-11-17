package com.qhn.bhne.footprinting.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.qhn.bhne.footprinting.entries.Project;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PROJECT".
*/
public class ProjectDao extends AbstractDao<Project, Long> {

    public static final String TABLENAME = "PROJECT";

    /**
     * Properties of entity Project.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ProjectId = new Property(0, Long.class, "projectId", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Category = new Property(2, String.class, "category", false, "CATEGORY");
        public final static Property Definition = new Property(3, int.class, "definition", false, "DEFINITION");
        public final static Property Batch = new Property(4, int.class, "batch", false, "BATCH");
        public final static Property Remark = new Property(5, String.class, "remark", false, "REMARK");
        public final static Property Date = new Property(6, String.class, "date", false, "DATE");
        public final static Property Describe = new Property(7, String.class, "describe", false, "DESCRIBE");
    }


    public ProjectDao(DaoConfig config) {
        super(config);
    }
    
    public ProjectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PROJECT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: projectId
                "\"NAME\" TEXT NOT NULL ," + // 1: name
                "\"CATEGORY\" TEXT," + // 2: category
                "\"DEFINITION\" INTEGER NOT NULL ," + // 3: definition
                "\"BATCH\" INTEGER NOT NULL ," + // 4: batch
                "\"REMARK\" TEXT," + // 5: remark
                "\"DATE\" TEXT," + // 6: date
                "\"DESCRIBE\" TEXT);"); // 7: describe
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PROJECT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Project entity) {
        stmt.clearBindings();
 
        Long projectId = entity.getProjectId();
        if (projectId != null) {
            stmt.bindLong(1, projectId);
        }
        stmt.bindString(2, entity.getName());
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
        stmt.bindLong(4, entity.getDefinition());
        stmt.bindLong(5, entity.getBatch());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(6, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(7, date);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(8, describe);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Project entity) {
        stmt.clearBindings();
 
        Long projectId = entity.getProjectId();
        if (projectId != null) {
            stmt.bindLong(1, projectId);
        }
        stmt.bindString(2, entity.getName());
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(3, category);
        }
        stmt.bindLong(4, entity.getDefinition());
        stmt.bindLong(5, entity.getBatch());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(6, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(7, date);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(8, describe);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Project readEntity(Cursor cursor, int offset) {
        Project entity = new Project( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // projectId
            cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // category
            cursor.getInt(offset + 3), // definition
            cursor.getInt(offset + 4), // batch
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // remark
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // date
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // describe
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Project entity, int offset) {
        entity.setProjectId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setCategory(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDefinition(cursor.getInt(offset + 3));
        entity.setBatch(cursor.getInt(offset + 4));
        entity.setRemark(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDescribe(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Project entity, long rowId) {
        entity.setProjectId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Project entity) {
        if(entity != null) {
            return entity.getProjectId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Project entity) {
        return entity.getProjectId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
