/* this file contains the actual definitions of */
/* the IIDs and CLSIDs */

/* link this file in with the server and any clients */


/* File created by MIDL compiler version 5.01.0164 */
/* at Sun Jun 25 18:44:26 2000
 */
/* Compiler settings for vwcomm.idl:
    Oicf (OptLev=i2), W0, Zp8, env=Win32, ms_ext, c_ext
    error checks: allocation ref bounds_check enum stub_data 
*/
//@@MIDL_FILE_HEADING(  )
#ifdef __cplusplus
extern "C"{
#endif 


#ifndef __IID_DEFINED__
#define __IID_DEFINED__

typedef struct _IID
{
    unsigned long x;
    unsigned short s1;
    unsigned short s2;
    unsigned char  c[8];
} IID;

#endif // __IID_DEFINED__

#ifndef CLSID_DEFINED
#define CLSID_DEFINED
typedef IID CLSID;
#endif // CLSID_DEFINED

const IID IID_IVWComm = {0xc1918680,0xdbe4,0x11cf,{0xa5,0x16,0x00,0xaa,0x00,0xb5,0x95,0xdb}};


const IID IID_IVWCommSite = {0xc1918682,0xdbe4,0x11cf,{0xa5,0x16,0x00,0xaa,0x00,0xb5,0x95,0xdb}};


const IID IID_IVWCommConnection = {0xc1918686,0xdbe4,0x11cf,{0xa5,0x16,0x00,0xaa,0x00,0xb5,0x95,0xdb}};


const IID IID_IVWCommMessage = {0xc1918688,0xdbe4,0x11cf,{0xa5,0x16,0x00,0xaa,0x00,0xb5,0x95,0xdb}};


#ifdef __cplusplus
}
#endif

