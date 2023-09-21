// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Iosxe.Outputs
{

    [OutputType]
    public sealed class GetCryptoIkev2KeyringPeerResult
    {
        public readonly string Description;
        public readonly string Hostname;
        public readonly string IdentityAddress;
        public readonly string IdentityEmailDomain;
        public readonly string IdentityEmailName;
        public readonly string IdentityFqdnDomain;
        public readonly string IdentityFqdnName;
        public readonly string IdentityKeyId;
        public readonly string Ipv4Address;
        public readonly string Ipv4Mask;
        public readonly string Ipv6Prefix;
        public readonly string Name;
        public readonly string PreSharedKey;
        public readonly string PreSharedKeyEncryption;
        public readonly string PreSharedKeyLocal;
        public readonly string PreSharedKeyLocalEncryption;
        public readonly string PreSharedKeyRemote;
        public readonly string PreSharedKeyRemoteEncryption;

        [OutputConstructor]
        private GetCryptoIkev2KeyringPeerResult(
            string description,

            string hostname,

            string identityAddress,

            string identityEmailDomain,

            string identityEmailName,

            string identityFqdnDomain,

            string identityFqdnName,

            string identityKeyId,

            string ipv4Address,

            string ipv4Mask,

            string ipv6Prefix,

            string name,

            string preSharedKey,

            string preSharedKeyEncryption,

            string preSharedKeyLocal,

            string preSharedKeyLocalEncryption,

            string preSharedKeyRemote,

            string preSharedKeyRemoteEncryption)
        {
            Description = description;
            Hostname = hostname;
            IdentityAddress = identityAddress;
            IdentityEmailDomain = identityEmailDomain;
            IdentityEmailName = identityEmailName;
            IdentityFqdnDomain = identityFqdnDomain;
            IdentityFqdnName = identityFqdnName;
            IdentityKeyId = identityKeyId;
            Ipv4Address = ipv4Address;
            Ipv4Mask = ipv4Mask;
            Ipv6Prefix = ipv6Prefix;
            Name = name;
            PreSharedKey = preSharedKey;
            PreSharedKeyEncryption = preSharedKeyEncryption;
            PreSharedKeyLocal = preSharedKeyLocal;
            PreSharedKeyLocalEncryption = preSharedKeyLocalEncryption;
            PreSharedKeyRemote = preSharedKeyRemote;
            PreSharedKeyRemoteEncryption = preSharedKeyRemoteEncryption;
        }
    }
}
