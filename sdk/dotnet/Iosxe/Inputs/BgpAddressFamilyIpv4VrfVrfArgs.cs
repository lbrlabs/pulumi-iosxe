// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Inputs
{

    public sealed class BgpAddressFamilyIpv4VrfVrfArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipv4UnicastAdvertiseL2vpnEvpn")]
        public Input<bool>? Ipv4UnicastAdvertiseL2vpnEvpn { get; set; }

        [Input("ipv4UnicastNetworks")]
        private InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworkArgs>? _ipv4UnicastNetworks;
        public InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworkArgs> Ipv4UnicastNetworks
        {
            get => _ipv4UnicastNetworks ?? (_ipv4UnicastNetworks = new InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworkArgs>());
            set => _ipv4UnicastNetworks = value;
        }

        [Input("ipv4UnicastNetworksMasks")]
        private InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskArgs>? _ipv4UnicastNetworksMasks;
        public InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskArgs> Ipv4UnicastNetworksMasks
        {
            get => _ipv4UnicastNetworksMasks ?? (_ipv4UnicastNetworksMasks = new InputList<Inputs.BgpAddressFamilyIpv4VrfVrfIpv4UnicastNetworksMaskArgs>());
            set => _ipv4UnicastNetworksMasks = value;
        }

        [Input("ipv4UnicastRedistributeConnected")]
        public Input<bool>? Ipv4UnicastRedistributeConnected { get; set; }

        [Input("ipv4UnicastRedistributeStatic")]
        public Input<bool>? Ipv4UnicastRedistributeStatic { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public BgpAddressFamilyIpv4VrfVrfArgs()
        {
        }
        public static new BgpAddressFamilyIpv4VrfVrfArgs Empty => new BgpAddressFamilyIpv4VrfVrfArgs();
    }
}