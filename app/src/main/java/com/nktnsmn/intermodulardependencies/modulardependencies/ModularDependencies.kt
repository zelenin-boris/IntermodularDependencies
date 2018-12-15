package com.nktnsmn.intermodulardependencies.modulardependencies

import com.nktnsmn.communicator.contract.dependencies.CommunicatorDependencies
import com.nktnsmn.disk.contract.dependencies.DiskDependencies
import com.nktnsmn.news.contract.dependencies.NewsDependencies

interface ModularDependencies :
    DiskDependencies,
    NewsDependencies,
    CommunicatorDependencies