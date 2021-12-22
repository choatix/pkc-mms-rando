package com.gmeister.temp.pkcmmsrando.map.data;

public class WarpFriendlyName
{
	public String FriendlyName;
	public String MapName;
	public int X;
	public int Y;
	public String GroupName;
	
	
	public WarpFriendlyName(String MapName, int x, int y, String groupName, String FriendlyName)
	{
		this.MapName = MapName;
		this.X = x;
		this.Y = y;
		this.FriendlyName = FriendlyName;
		this.GroupName = groupName;
	}
	
	
}