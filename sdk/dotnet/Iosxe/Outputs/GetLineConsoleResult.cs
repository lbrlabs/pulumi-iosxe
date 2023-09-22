// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Iosxe.Outputs
{

    [OutputType]
    public sealed class GetLineConsoleResult
    {
        /// <summary>
        /// \n\n;;Timeout in minutes
        /// </summary>
        public readonly int ExecTimeoutMinutes;
        /// <summary>
        /// \n\n;;Timeout in seconds
        /// </summary>
        public readonly int ExecTimeoutSeconds;
        public readonly string First;
        public readonly string LoginAuthentication;
        public readonly bool LoginLocal;
        public readonly string Password;
        /// <summary>
        /// Set exec level password
        /// </summary>
        public readonly int PasswordLevel;
        public readonly string PasswordType;
        public readonly int PrivilegeLevel;
        /// <summary>
        /// Set async line stop bits
        /// </summary>
        public readonly string Stopbits;

        [OutputConstructor]
        private GetLineConsoleResult(
            int execTimeoutMinutes,

            int execTimeoutSeconds,

            string first,

            string loginAuthentication,

            bool loginLocal,

            string password,

            int passwordLevel,

            string passwordType,

            int privilegeLevel,

            string stopbits)
        {
            ExecTimeoutMinutes = execTimeoutMinutes;
            ExecTimeoutSeconds = execTimeoutSeconds;
            First = first;
            LoginAuthentication = loginAuthentication;
            LoginLocal = loginLocal;
            Password = password;
            PasswordLevel = passwordLevel;
            PasswordType = passwordType;
            PrivilegeLevel = privilegeLevel;
            Stopbits = stopbits;
        }
    }
}