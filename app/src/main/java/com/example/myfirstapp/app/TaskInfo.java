package com.example.myfirstapp.app;

import android.graphics.Color;

import java.sql.Time;
import java.util.Date;

/**
 * Store all of the settings of the task
 * Display the important ones (title, if we have titles, and due date)
 */
public class TaskInfo {

    // time created, edited, and due
    private Date created;
    private Date edited;
    private Date due;

    // low, normal, or high importance possible
    private ImportanceLevel importance;

    // set to true if due is within certain range of current date
    // said determination (namely, retrieval of current date) not yet done
    private boolean isCurrent;
    private Color color;

    public TaskInfo(){
        this(ImportanceLevel.normal, true, null);
    }

    public TaskInfo(ImportanceLevel level){
        this(level, true, null);
    }

    public TaskInfo(ImportanceLevel level, Date due){
        this(level, true, due);
    }

    public TaskInfo(ImportanceLevel level, boolean isCurrent, Date due){
        // TODO must decide how to deal with getting due date, decided whether it's current
        created = new Date();
        edited = created;
        this.due = due;
        this.isCurrent = isCurrent;
        importance = level;
    }

    public boolean determineIsCurrent(){
        // TODO figure out how to decide isCurrent
        boolean updated = true;
        isCurrent = updated;
        return updated;
    }

    public ImportanceLevel getImportance(){
        return importance;
    }

    public void setImportance(ImportanceLevel toStore){
        importance = toStore;
    }

    public void setImportance(int level){
        if(level == 0){
            importance = ImportanceLevel.low;
        } else if (level == 1){
            importance = ImportanceLevel.normal;
        } else {
            importance = ImportanceLevel.high;
        }
    }

    public void setCurrent(boolean isCurrent){
        this.isCurrent = isCurrent;
    }

    public boolean getCurrent(){
        return isCurrent;
    }

    public void setEdited(Date date){
        edited = date;
    }

    public void setDue(Date date){
        due = date;
    }

    public Date getEdited(){
        return edited;
    }

    public Date getDue(){
        return due;
    }

    public Date getCreated(){
        return created;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color = color;
    }
}