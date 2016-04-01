package com.github.hexosse.pluginframework.pluginapi.command.type;

/*
 * Copyright 2016 Hexosse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.bukkit.Bukkit;
import org.bukkit.World;

/**
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
public class ArgTypeWorld implements ArgType<World>
{
	private ArgTypeWorld() {};
	private static ArgTypeWorld i = new ArgTypeWorld();
	public static ArgTypeWorld get() { return i; }

	@Override
	public boolean check(String world)
	{
		return get(world)!=null;
	}

	@Override
	public World get(String world)
	{
		try
		{
			return Bukkit.getServer().getWorld(world);
		}
		catch(Exception e)
		{
			return null;
		}
	}
}