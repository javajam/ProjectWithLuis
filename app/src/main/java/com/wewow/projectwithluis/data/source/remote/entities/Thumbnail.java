package com.wewow.projectwithluis.data.source.remote.entities;

/**
 * Created by eleroy on 5/11/2017.
 */

public class Thumbnail
{
    private String extension;

    private String path;

    public String getExtension ()
    {
        return extension;
    }

    public void setExtension (String extension)
    {
        this.extension = extension;
    }

    public String getPath ()
    {
        return path;
    }

    public void setPath (String path)
    {
        this.path = path;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [extension = "+extension+", path = "+path+"]";
    }
}
