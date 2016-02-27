package com.github.dockerjava.api.command;

import com.github.dockerjava.api.model.ContainerNetwork;
import com.github.dockerjava.core.RemoteApiVersion;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Connects a container to a network.
 *
 * @since {@link RemoteApiVersion#VERSION_1_21}
 */
public interface ConnectToNetworkCmd extends SyncDockerCmd<Void> {

    @CheckForNull
    String getNetworkId();

    @CheckForNull
    String getContainerId();

    @CheckForNull
    ContainerNetwork getEndpointConfig();

    ConnectToNetworkCmd withNetworkId(@Nonnull String networkId);

    ConnectToNetworkCmd withContainerId(@Nonnull String containerId);

    ConnectToNetworkCmd withEndpointConfig(@Nonnull ContainerNetwork endpointConfig);

    interface Exec extends DockerCmdSyncExec<ConnectToNetworkCmd, Void> {
    }
}
