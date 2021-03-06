/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.timesheet.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TimeEntry service. Represents a row in the &quot;TIME_TimeEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.timesheet.model.impl.TimeEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.timesheet.model.impl.TimeEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TimeEntry
 * @see com.liferay.timesheet.model.impl.TimeEntryImpl
 * @see com.liferay.timesheet.model.impl.TimeEntryModelImpl
 * @generated
 */
@ProviderType
public interface TimeEntryModel extends BaseModel<TimeEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a time entry model instance should use the {@link TimeEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this time entry.
	 *
	 * @return the primary key of this time entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this time entry.
	 *
	 * @param primaryKey the primary key of this time entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the time entry ID of this time entry.
	 *
	 * @return the time entry ID of this time entry
	 */
	public long getTimeEntryId();

	/**
	 * Sets the time entry ID of this time entry.
	 *
	 * @param timeEntryId the time entry ID of this time entry
	 */
	public void setTimeEntryId(long timeEntryId);

	/**
	 * Returns the user ID of this time entry.
	 *
	 * @return the user ID of this time entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this time entry.
	 *
	 * @param userId the user ID of this time entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this time entry.
	 *
	 * @return the user uuid of this time entry
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this time entry.
	 *
	 * @param userUuid the user uuid of this time entry
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the hours of this time entry.
	 *
	 * @return the hours of this time entry
	 */
	public Double getHours();

	/**
	 * Sets the hours of this time entry.
	 *
	 * @param hours the hours of this time entry
	 */
	public void setHours(Double hours);

	/**
	 * Returns the project ID of this time entry.
	 *
	 * @return the project ID of this time entry
	 */
	public long getProjectId();

	/**
	 * Sets the project ID of this time entry.
	 *
	 * @param projectId the project ID of this time entry
	 */
	public void setProjectId(long projectId);

	/**
	 * Returns the task ID of this time entry.
	 *
	 * @return the task ID of this time entry
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this time entry.
	 *
	 * @param taskId the task ID of this time entry
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the billable of this time entry.
	 *
	 * @return the billable of this time entry
	 */
	public boolean getBillable();

	/**
	 * Returns <code>true</code> if this time entry is billable.
	 *
	 * @return <code>true</code> if this time entry is billable; <code>false</code> otherwise
	 */
	public boolean isBillable();

	/**
	 * Sets whether this time entry is billable.
	 *
	 * @param billable the billable of this time entry
	 */
	public void setBillable(boolean billable);

	/**
	 * Returns the timesheet ID of this time entry.
	 *
	 * @return the timesheet ID of this time entry
	 */
	public long getTimesheetId();

	/**
	 * Sets the timesheet ID of this time entry.
	 *
	 * @param timesheetId the timesheet ID of this time entry
	 */
	public void setTimesheetId(long timesheetId);

	/**
	 * Returns the on date of this time entry.
	 *
	 * @return the on date of this time entry
	 */
	public Date getOnDate();

	/**
	 * Sets the on date of this time entry.
	 *
	 * @param onDate the on date of this time entry
	 */
	public void setOnDate(Date onDate);

	/**
	 * Returns the message of this time entry.
	 *
	 * @return the message of this time entry
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this time entry.
	 *
	 * @param message the message of this time entry
	 */
	public void setMessage(String message);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TimeEntry timeEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TimeEntry> toCacheModel();

	@Override
	public TimeEntry toEscapedModel();

	@Override
	public TimeEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}