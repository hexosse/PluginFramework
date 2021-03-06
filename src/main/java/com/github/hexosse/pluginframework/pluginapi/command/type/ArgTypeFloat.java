package com.github.hexosse.pluginframework.pluginapi.command.type;

/*
 * Copyright 2016 hexosse
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import com.github.hexosse.pluginframework.pluginapi.command.CommandInfo;

import java.util.List;

/**
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
public class ArgTypeFloat implements ArgType<Float>
{
	private ArgTypeFloat() {};
	private static ArgTypeFloat t = new ArgTypeFloat();
	public static ArgTypeFloat get() { return t; }

	@Override
	public boolean check(String dbl)
	{
		return get(dbl)!=null;
	}

	@Override
	public Float get(String flt)
	{
		try
		{
			return Float.parseFloat(flt);
		}
		catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public List<String> tabComplete(CommandInfo commandInfo)
	{
		return null;
	}
}
