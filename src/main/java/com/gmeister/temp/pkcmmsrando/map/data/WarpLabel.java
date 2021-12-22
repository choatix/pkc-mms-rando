package com.gmeister.temp.pkcmmsrando.map.data;

import java.util.List;

public class WarpLabel {
	
	public String MapName;
	public String DestinationName;
	public int MapX;
	public int MapY;
	public int DestX;
	public int DestY;	
	public String FriendlyName;
	public String GroupName;
	
	public static boolean WithinOne(int x, int y, int xx, int yy)
	{
		if(x == xx && y == yy)
		{
			return true;
		}
		
		if(x == xx && Math.abs(y - yy)==1)
		{
			return true;
		}
		
		if(y == yy && Math.abs(x - xx)==1)
		{
			return true;
		}
		
		
		return false;
	}
	
	public static boolean IsEquivalentWarp(WarpLabel wp, List<WarpLabel> list)
	{
	
		for(var item:list)
		{
			if(wp.MapName == item.MapName && WarpLabel.WithinOne(wp.MapX, wp.MapY, item.MapX, item.MapY))
			{
				if(wp.DestinationName == item.DestinationName &&
						WarpLabel.WithinOne(wp.DestX, wp.DestY, item.DestX, item.DestY))
				{
					return true;
				}
			}
			
			
		}
		
		return false;
	}
	
	public static WarpLabel FindWarp(List<WarpLabel> list, WarpLabel warp)
	{
		for(var item:list)
		{
			if(item.MapName == warp.MapName && warp.MapX == item.MapX && warp.MapY == item.MapY)
			{
				return item;
			}
		}
		
		return null;
	}
	
	public WarpLabel(String name, String DestName, int x, int y, int xx, int yy)
	{
		this.MapName = name;
		this.DestinationName = DestName;
		this.MapX = x;
		this.MapY = y;
		this.DestX = xx;
		this.DestY = yy;
	}
	
	public void SetFriendlyName(String name)
	{
		this.FriendlyName = name;
	}
	
	public void SetGroupName(String name)
	{
		this.GroupName = name;
	}
	
	

	@Override
	public String toString()
	{
		return String.format("%s\t%d\t%d\t%s\t%d\t%d", this.MapName, this.MapX, this.MapY,
				this.DestinationName, this.DestX, this.DestY);
		
		
		//return String.format("%s (%d, %d) > %s (%d, %d)", this.MapName, this.MapX, this.MapY,
			//	this.DestinationName, this.DestX, this.DestY);
	}
}
