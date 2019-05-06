package com.naxanria.mappy.config;

import com.naxanria.mappy.client.DrawPosition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Config extends ConfigBase<Config>
{
  public static Config instance;
  
  public Config(File file)
  {
    super(file);
    
    instance = this;
  }
  
  @Override
  protected void init()
  {
    addEntry(new ConfigEntry.IntegerEntry("offset", dataMap, 4));
    addEntry(new ConfigEntry.IntegerRangeEntry("drawPosition", dataMap, DrawPosition.TOP_RIGHT.ordinal(), DrawPosition.values().length - 1));
    addEntry(new ConfigEntry.IntegerRangeEntry("mapSize", dataMap, 64, 16, 256));
    addEntry(new ConfigEntry.BooleanEntry("showPosition", dataMap, true));
    addEntry(new ConfigEntry.BooleanEntry("showFPS", dataMap, true));
    addEntry(new ConfigEntry.BooleanEntry("showBiome", dataMap, true));
    addEntry(new ConfigEntry.BooleanEntry("showTime", dataMap, true));
    addEntry(new ConfigEntry.BooleanEntry("showPlayerNames", dataMap, true));
    addEntry(new ConfigEntry.BooleanEntry("showPlayerHeads", dataMap, true));
    
    
    addEntry(new ConfigEntry.BooleanEntry("alphaFeatures", dataMap, false));
  }
  
  public int getOffset()
  {
    return getInt("offset");
  }
  
  public DrawPosition getPosition()
  {
    int p = getInt("drawPosition");
    return DrawPosition.values()[p];
  }
  
  public int getMapSize()
  {
    return getInt("mapSize");
  }
  
  public boolean showFPS()
  {
    return getBoolean("showFPS");
  }
  
  public boolean showPosition()
  {
    return getBoolean("showPosition");
  }
  
  public boolean showBiome()
  {
    return getBoolean("showBiome");
  }
  
  public boolean showTime()
  {
    return getBoolean("showTime");
  }
  
  public boolean showPlayerNames()
  {
    return getBoolean("showPlayerNames");
  }
  
  public boolean alphaFeatures()
  {
    return getBoolean("alphaFeatures");
  }
  
  public boolean showPlayerHeads()
  {
    return getBoolean("showPlayerHeads");
  }
}
