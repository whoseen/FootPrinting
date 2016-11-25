package com.qhn.bhne.footprinting.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.qhn.bhne.footprinting.mvp.entries.Project;

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
        public final static Property UserName = new Property(2, String.class, "userName", false, "USER_NAME");
        public final static Property Category = new Property(3, String.class, "category", false, "CATEGORY");
        public final static Property Definition = new Property(4, int.class, "definition", false, "DEFINITION");
        public final static Property Batch = new Property(5, int.class, "batch", false, "BATCH");
        public final static Property Remark = new Property(6, String.class, "remark", false, "REMARK");
        public final static Property Date = new Property(7, String.class, "date", false, "DATE");
        public final static Property Describe = new Property(8, String.class, "describe", false, "DESCRIBE");
        public final static Property ProjectMax = new Property(9, int.class, "projectMax", false, "PROJECT_MAX");
        public final static Property ParentID = new Property(10, Long.class, "parentID", false, "PARENT_ID");
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
                "\"USER_NAME\" TEXT NOT NULL ," + // 2: userName
                "\"CATEGORY\" TEXT," + // 3: category
                "\"DEFINITION\" INTEGER NOT NULL ," + // 4: definition
                "\"BATCH\" INTEGER NOT NULL ," + // 5: batch
                "\"REMARK\" TEXT," + // 6: remark
                "\"DATE\" TEXT," + // 7: date
                "\"DESCRIBE\" TEXT," + // 8: describe
                "\"PROJECT_MAX\" INTEGER NOT NULL ," + // 9: projectMax
                "\"PARENT_ID\" INTEGER);"); // 10: parentID
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
        stmt.bindString(3, entity.getUserName());
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(4, category);
        }
        stmt.bindLong(5, entity.getDefinition());
        stmt.bindLong(6, entity.getBatch());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(7, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(8, date);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(9, describe);
        }
        stmt.bindLong(10, entity.getProjectMax());
 
        Long parentID = entity.getParentID();
        if (parentID != null) {
            stmt.bindLong(11, parentID);
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
        stmt.bindString(3, entity.getUserName());
 
        String category = entity.getCategory();
        if (category != null) {
            stmt.bindString(4, category);
        }
        stmt.bindLong(5, entity.getDefinition());
        stmt.bindLong(6, entity.getBatch());
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(7, remark);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(8, date);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(9, describe);
        }
        stmt.bindLong(10, entity.getProjectMax());
 
        Long parentID = entity.getParentID();
        if (parentID != null) {
            stmt.bindLong(11, parentID);
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
            cursor.getString(offset + 2), // userName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // category
            cursor.getInt(offset + 4), // definition
            cursor.getInt(offset + 5), // batch
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // remark
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // date
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // describe
            cursor.getInt(offset + 9), // projectMax
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // parentID
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Project entity, int offset) {
        entity.setProjectId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.getString(offset + 1));
        entity.setUserName(cursor.getString(offset + 2));
        entity.setCategory(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDefinition(cursor.getInt(offset + 4));
        entity.setBatch(cursor.getInt(offset + 5));
        entity.setRemark(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setDescribe(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setProjectMax(cursor.getInt(offset + 9));
        entity.setParentID(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
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
