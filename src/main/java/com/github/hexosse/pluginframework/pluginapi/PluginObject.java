package com.github.hexosse.pluginframework.pluginapi;

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

import com.github.hexosse.pluginframework.pluginapi.logging.PluginLogger;
import com.github.hexosse.pluginframework.pluginapi.message.MessageManager;

/**
 * The class that all other object belonging to this plugin should extend.
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
public abstract class PluginObject<PluginClass extends Plugin> {

    /**
     * The plugin that created this object.
     */
    protected PluginClass plugin;

    /**
     * The logger used by the plugin
     */
    protected PluginLogger pluginLogger;

    /**
     * The message manager used by the plugin
     */
    protected MessageManager messageManager;


    /**
     * @param plugin	The plugin that this object belong to.
     */
    public PluginObject(PluginClass plugin){
        this.plugin = plugin;
        this.pluginLogger = plugin.getPluginLogger();
        this.messageManager = plugin.getMessageManager();
    }

    /**
     * @return The logger used by the plugin
     */
    public PluginClass getPlugin() {
        return plugin;
    }

    /**
     * @return The logger used by the plugin
     */
    public PluginLogger getLogger() {
        return pluginLogger;
    }

    /**
     * @return The message manager used by the plugin
     */
    public MessageManager getMessageManager() {
        return messageManager;
    }
}
