# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetClockResult',
    'AwaitableGetClockResult',
    'get_clock',
    'get_clock_output',
]

@pulumi.output_type
class GetClockResult:
    """
    A collection of values returned by getClock.
    """
    def __init__(__self__, calendar_valid=None, device=None, id=None, summer_time_date=None, summer_time_date_end_day=None, summer_time_date_end_month=None, summer_time_date_end_time=None, summer_time_date_end_year=None, summer_time_date_offset=None, summer_time_date_start_day=None, summer_time_date_start_month=None, summer_time_date_start_time=None, summer_time_date_start_year=None, summer_time_recurring=None, summer_time_recurring_end_month=None, summer_time_recurring_end_time=None, summer_time_recurring_end_week=None, summer_time_recurring_end_weekday=None, summer_time_recurring_offset=None, summer_time_recurring_start_month=None, summer_time_recurring_start_time=None, summer_time_recurring_start_week=None, summer_time_recurring_start_weekday=None, summer_time_zone=None):
        if calendar_valid and not isinstance(calendar_valid, bool):
            raise TypeError("Expected argument 'calendar_valid' to be a bool")
        pulumi.set(__self__, "calendar_valid", calendar_valid)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if summer_time_date and not isinstance(summer_time_date, bool):
            raise TypeError("Expected argument 'summer_time_date' to be a bool")
        pulumi.set(__self__, "summer_time_date", summer_time_date)
        if summer_time_date_end_day and not isinstance(summer_time_date_end_day, int):
            raise TypeError("Expected argument 'summer_time_date_end_day' to be a int")
        pulumi.set(__self__, "summer_time_date_end_day", summer_time_date_end_day)
        if summer_time_date_end_month and not isinstance(summer_time_date_end_month, str):
            raise TypeError("Expected argument 'summer_time_date_end_month' to be a str")
        pulumi.set(__self__, "summer_time_date_end_month", summer_time_date_end_month)
        if summer_time_date_end_time and not isinstance(summer_time_date_end_time, str):
            raise TypeError("Expected argument 'summer_time_date_end_time' to be a str")
        pulumi.set(__self__, "summer_time_date_end_time", summer_time_date_end_time)
        if summer_time_date_end_year and not isinstance(summer_time_date_end_year, int):
            raise TypeError("Expected argument 'summer_time_date_end_year' to be a int")
        pulumi.set(__self__, "summer_time_date_end_year", summer_time_date_end_year)
        if summer_time_date_offset and not isinstance(summer_time_date_offset, int):
            raise TypeError("Expected argument 'summer_time_date_offset' to be a int")
        pulumi.set(__self__, "summer_time_date_offset", summer_time_date_offset)
        if summer_time_date_start_day and not isinstance(summer_time_date_start_day, int):
            raise TypeError("Expected argument 'summer_time_date_start_day' to be a int")
        pulumi.set(__self__, "summer_time_date_start_day", summer_time_date_start_day)
        if summer_time_date_start_month and not isinstance(summer_time_date_start_month, str):
            raise TypeError("Expected argument 'summer_time_date_start_month' to be a str")
        pulumi.set(__self__, "summer_time_date_start_month", summer_time_date_start_month)
        if summer_time_date_start_time and not isinstance(summer_time_date_start_time, str):
            raise TypeError("Expected argument 'summer_time_date_start_time' to be a str")
        pulumi.set(__self__, "summer_time_date_start_time", summer_time_date_start_time)
        if summer_time_date_start_year and not isinstance(summer_time_date_start_year, int):
            raise TypeError("Expected argument 'summer_time_date_start_year' to be a int")
        pulumi.set(__self__, "summer_time_date_start_year", summer_time_date_start_year)
        if summer_time_recurring and not isinstance(summer_time_recurring, bool):
            raise TypeError("Expected argument 'summer_time_recurring' to be a bool")
        pulumi.set(__self__, "summer_time_recurring", summer_time_recurring)
        if summer_time_recurring_end_month and not isinstance(summer_time_recurring_end_month, str):
            raise TypeError("Expected argument 'summer_time_recurring_end_month' to be a str")
        pulumi.set(__self__, "summer_time_recurring_end_month", summer_time_recurring_end_month)
        if summer_time_recurring_end_time and not isinstance(summer_time_recurring_end_time, str):
            raise TypeError("Expected argument 'summer_time_recurring_end_time' to be a str")
        pulumi.set(__self__, "summer_time_recurring_end_time", summer_time_recurring_end_time)
        if summer_time_recurring_end_week and not isinstance(summer_time_recurring_end_week, str):
            raise TypeError("Expected argument 'summer_time_recurring_end_week' to be a str")
        pulumi.set(__self__, "summer_time_recurring_end_week", summer_time_recurring_end_week)
        if summer_time_recurring_end_weekday and not isinstance(summer_time_recurring_end_weekday, str):
            raise TypeError("Expected argument 'summer_time_recurring_end_weekday' to be a str")
        pulumi.set(__self__, "summer_time_recurring_end_weekday", summer_time_recurring_end_weekday)
        if summer_time_recurring_offset and not isinstance(summer_time_recurring_offset, int):
            raise TypeError("Expected argument 'summer_time_recurring_offset' to be a int")
        pulumi.set(__self__, "summer_time_recurring_offset", summer_time_recurring_offset)
        if summer_time_recurring_start_month and not isinstance(summer_time_recurring_start_month, str):
            raise TypeError("Expected argument 'summer_time_recurring_start_month' to be a str")
        pulumi.set(__self__, "summer_time_recurring_start_month", summer_time_recurring_start_month)
        if summer_time_recurring_start_time and not isinstance(summer_time_recurring_start_time, str):
            raise TypeError("Expected argument 'summer_time_recurring_start_time' to be a str")
        pulumi.set(__self__, "summer_time_recurring_start_time", summer_time_recurring_start_time)
        if summer_time_recurring_start_week and not isinstance(summer_time_recurring_start_week, str):
            raise TypeError("Expected argument 'summer_time_recurring_start_week' to be a str")
        pulumi.set(__self__, "summer_time_recurring_start_week", summer_time_recurring_start_week)
        if summer_time_recurring_start_weekday and not isinstance(summer_time_recurring_start_weekday, str):
            raise TypeError("Expected argument 'summer_time_recurring_start_weekday' to be a str")
        pulumi.set(__self__, "summer_time_recurring_start_weekday", summer_time_recurring_start_weekday)
        if summer_time_zone and not isinstance(summer_time_zone, str):
            raise TypeError("Expected argument 'summer_time_zone' to be a str")
        pulumi.set(__self__, "summer_time_zone", summer_time_zone)

    @property
    @pulumi.getter(name="calendarValid")
    def calendar_valid(self) -> bool:
        return pulumi.get(self, "calendar_valid")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="summerTimeDate")
    def summer_time_date(self) -> bool:
        return pulumi.get(self, "summer_time_date")

    @property
    @pulumi.getter(name="summerTimeDateEndDay")
    def summer_time_date_end_day(self) -> int:
        return pulumi.get(self, "summer_time_date_end_day")

    @property
    @pulumi.getter(name="summerTimeDateEndMonth")
    def summer_time_date_end_month(self) -> str:
        return pulumi.get(self, "summer_time_date_end_month")

    @property
    @pulumi.getter(name="summerTimeDateEndTime")
    def summer_time_date_end_time(self) -> str:
        return pulumi.get(self, "summer_time_date_end_time")

    @property
    @pulumi.getter(name="summerTimeDateEndYear")
    def summer_time_date_end_year(self) -> int:
        return pulumi.get(self, "summer_time_date_end_year")

    @property
    @pulumi.getter(name="summerTimeDateOffset")
    def summer_time_date_offset(self) -> int:
        return pulumi.get(self, "summer_time_date_offset")

    @property
    @pulumi.getter(name="summerTimeDateStartDay")
    def summer_time_date_start_day(self) -> int:
        return pulumi.get(self, "summer_time_date_start_day")

    @property
    @pulumi.getter(name="summerTimeDateStartMonth")
    def summer_time_date_start_month(self) -> str:
        return pulumi.get(self, "summer_time_date_start_month")

    @property
    @pulumi.getter(name="summerTimeDateStartTime")
    def summer_time_date_start_time(self) -> str:
        return pulumi.get(self, "summer_time_date_start_time")

    @property
    @pulumi.getter(name="summerTimeDateStartYear")
    def summer_time_date_start_year(self) -> int:
        return pulumi.get(self, "summer_time_date_start_year")

    @property
    @pulumi.getter(name="summerTimeRecurring")
    def summer_time_recurring(self) -> bool:
        return pulumi.get(self, "summer_time_recurring")

    @property
    @pulumi.getter(name="summerTimeRecurringEndMonth")
    def summer_time_recurring_end_month(self) -> str:
        return pulumi.get(self, "summer_time_recurring_end_month")

    @property
    @pulumi.getter(name="summerTimeRecurringEndTime")
    def summer_time_recurring_end_time(self) -> str:
        return pulumi.get(self, "summer_time_recurring_end_time")

    @property
    @pulumi.getter(name="summerTimeRecurringEndWeek")
    def summer_time_recurring_end_week(self) -> str:
        return pulumi.get(self, "summer_time_recurring_end_week")

    @property
    @pulumi.getter(name="summerTimeRecurringEndWeekday")
    def summer_time_recurring_end_weekday(self) -> str:
        return pulumi.get(self, "summer_time_recurring_end_weekday")

    @property
    @pulumi.getter(name="summerTimeRecurringOffset")
    def summer_time_recurring_offset(self) -> int:
        return pulumi.get(self, "summer_time_recurring_offset")

    @property
    @pulumi.getter(name="summerTimeRecurringStartMonth")
    def summer_time_recurring_start_month(self) -> str:
        return pulumi.get(self, "summer_time_recurring_start_month")

    @property
    @pulumi.getter(name="summerTimeRecurringStartTime")
    def summer_time_recurring_start_time(self) -> str:
        return pulumi.get(self, "summer_time_recurring_start_time")

    @property
    @pulumi.getter(name="summerTimeRecurringStartWeek")
    def summer_time_recurring_start_week(self) -> str:
        return pulumi.get(self, "summer_time_recurring_start_week")

    @property
    @pulumi.getter(name="summerTimeRecurringStartWeekday")
    def summer_time_recurring_start_weekday(self) -> str:
        return pulumi.get(self, "summer_time_recurring_start_weekday")

    @property
    @pulumi.getter(name="summerTimeZone")
    def summer_time_zone(self) -> str:
        return pulumi.get(self, "summer_time_zone")


class AwaitableGetClockResult(GetClockResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClockResult(
            calendar_valid=self.calendar_valid,
            device=self.device,
            id=self.id,
            summer_time_date=self.summer_time_date,
            summer_time_date_end_day=self.summer_time_date_end_day,
            summer_time_date_end_month=self.summer_time_date_end_month,
            summer_time_date_end_time=self.summer_time_date_end_time,
            summer_time_date_end_year=self.summer_time_date_end_year,
            summer_time_date_offset=self.summer_time_date_offset,
            summer_time_date_start_day=self.summer_time_date_start_day,
            summer_time_date_start_month=self.summer_time_date_start_month,
            summer_time_date_start_time=self.summer_time_date_start_time,
            summer_time_date_start_year=self.summer_time_date_start_year,
            summer_time_recurring=self.summer_time_recurring,
            summer_time_recurring_end_month=self.summer_time_recurring_end_month,
            summer_time_recurring_end_time=self.summer_time_recurring_end_time,
            summer_time_recurring_end_week=self.summer_time_recurring_end_week,
            summer_time_recurring_end_weekday=self.summer_time_recurring_end_weekday,
            summer_time_recurring_offset=self.summer_time_recurring_offset,
            summer_time_recurring_start_month=self.summer_time_recurring_start_month,
            summer_time_recurring_start_time=self.summer_time_recurring_start_time,
            summer_time_recurring_start_week=self.summer_time_recurring_start_week,
            summer_time_recurring_start_weekday=self.summer_time_recurring_start_weekday,
            summer_time_zone=self.summer_time_zone)


def get_clock(device: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClockResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['device'] = device
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('iosxe:iosxe/getClock:getClock', __args__, opts=opts, typ=GetClockResult).value

    return AwaitableGetClockResult(
        calendar_valid=pulumi.get(__ret__, 'calendar_valid'),
        device=pulumi.get(__ret__, 'device'),
        id=pulumi.get(__ret__, 'id'),
        summer_time_date=pulumi.get(__ret__, 'summer_time_date'),
        summer_time_date_end_day=pulumi.get(__ret__, 'summer_time_date_end_day'),
        summer_time_date_end_month=pulumi.get(__ret__, 'summer_time_date_end_month'),
        summer_time_date_end_time=pulumi.get(__ret__, 'summer_time_date_end_time'),
        summer_time_date_end_year=pulumi.get(__ret__, 'summer_time_date_end_year'),
        summer_time_date_offset=pulumi.get(__ret__, 'summer_time_date_offset'),
        summer_time_date_start_day=pulumi.get(__ret__, 'summer_time_date_start_day'),
        summer_time_date_start_month=pulumi.get(__ret__, 'summer_time_date_start_month'),
        summer_time_date_start_time=pulumi.get(__ret__, 'summer_time_date_start_time'),
        summer_time_date_start_year=pulumi.get(__ret__, 'summer_time_date_start_year'),
        summer_time_recurring=pulumi.get(__ret__, 'summer_time_recurring'),
        summer_time_recurring_end_month=pulumi.get(__ret__, 'summer_time_recurring_end_month'),
        summer_time_recurring_end_time=pulumi.get(__ret__, 'summer_time_recurring_end_time'),
        summer_time_recurring_end_week=pulumi.get(__ret__, 'summer_time_recurring_end_week'),
        summer_time_recurring_end_weekday=pulumi.get(__ret__, 'summer_time_recurring_end_weekday'),
        summer_time_recurring_offset=pulumi.get(__ret__, 'summer_time_recurring_offset'),
        summer_time_recurring_start_month=pulumi.get(__ret__, 'summer_time_recurring_start_month'),
        summer_time_recurring_start_time=pulumi.get(__ret__, 'summer_time_recurring_start_time'),
        summer_time_recurring_start_week=pulumi.get(__ret__, 'summer_time_recurring_start_week'),
        summer_time_recurring_start_weekday=pulumi.get(__ret__, 'summer_time_recurring_start_weekday'),
        summer_time_zone=pulumi.get(__ret__, 'summer_time_zone'))


@_utilities.lift_output_func(get_clock)
def get_clock_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClockResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
