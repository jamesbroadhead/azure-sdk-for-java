/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import java.util.List;

/**
 * A task defined on a pool and run by compute nodes when they join the pool.
 */
public class StartTask {
    /**
     * Gets or sets the command line of the start task.
     */
    private String commandLine;

    /**
     * Gets or sets a list of files that Batch will download to the compute
     * node before running the command line.
     */
    private List<ResourceFile> resourceFiles;

    /**
     * Gets or sets a list of environment variable settings for the start task.
     */
    private List<EnvironmentSetting> environmentSettings;

    /**
     * Gets or sets whether to run the start task in elevated mode. The
     * default value is false.
     */
    private Boolean runElevated;

    /**
     * Gets or sets the maximum number of times the task may be retried.
     */
    private Integer maxTaskRetryCount;

    /**
     * Gets or sets whether the Batch Service should wait for the start task
     * to complete successfully (that is, to exit with exit code 0) before
     * scheduling any tasks on the compute node.
     */
    private Boolean waitForSuccess;

    /**
     * Get the commandLine value.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine value.
     *
     * @param commandLine the commandLine value to set
     * @return the StartTask object itself.
     */
    public StartTask setCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get the resourceFiles value.
     *
     * @return the resourceFiles value
     */
    public List<ResourceFile> resourceFiles() {
        return this.resourceFiles;
    }

    /**
     * Set the resourceFiles value.
     *
     * @param resourceFiles the resourceFiles value to set
     * @return the StartTask object itself.
     */
    public StartTask setResourceFiles(List<ResourceFile> resourceFiles) {
        this.resourceFiles = resourceFiles;
        return this;
    }

    /**
     * Get the environmentSettings value.
     *
     * @return the environmentSettings value
     */
    public List<EnvironmentSetting> environmentSettings() {
        return this.environmentSettings;
    }

    /**
     * Set the environmentSettings value.
     *
     * @param environmentSettings the environmentSettings value to set
     * @return the StartTask object itself.
     */
    public StartTask setEnvironmentSettings(List<EnvironmentSetting> environmentSettings) {
        this.environmentSettings = environmentSettings;
        return this;
    }

    /**
     * Get the runElevated value.
     *
     * @return the runElevated value
     */
    public Boolean runElevated() {
        return this.runElevated;
    }

    /**
     * Set the runElevated value.
     *
     * @param runElevated the runElevated value to set
     * @return the StartTask object itself.
     */
    public StartTask setRunElevated(Boolean runElevated) {
        this.runElevated = runElevated;
        return this;
    }

    /**
     * Get the maxTaskRetryCount value.
     *
     * @return the maxTaskRetryCount value
     */
    public Integer maxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount value.
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set
     * @return the StartTask object itself.
     */
    public StartTask setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }

    /**
     * Get the waitForSuccess value.
     *
     * @return the waitForSuccess value
     */
    public Boolean waitForSuccess() {
        return this.waitForSuccess;
    }

    /**
     * Set the waitForSuccess value.
     *
     * @param waitForSuccess the waitForSuccess value to set
     * @return the StartTask object itself.
     */
    public StartTask setWaitForSuccess(Boolean waitForSuccess) {
        this.waitForSuccess = waitForSuccess;
        return this;
    }

}